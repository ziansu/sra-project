public static void main(java.lang.String[] args) {
    core.Graph.exportCleanJSON();
    control.Main.markovController = new control.MarkovController();
    control.Main.sensorCollector = new communications.SensorCollector(control.Main.props.getAnomalyPathsValue());
    new java.lang.Thread(control.Main.sensorCollector).start();
    control.Main.markovController.parse("IDAtaque=1;TipoAtaque=Denegacion de Servicio;Nodos=Intento de intrusion,Buffer Overflow,Denegacion de Servicio;Estado=Buffer Overflow;PEstado=0.9998914037855784;PFinal=0.6231988799803523;Risk=2;Markovid=1");
    control.Main.sensorConfigurator = new control.SensorConfigurator();
    control.Main.logReceiver = new communications.LogReceiver(5000, "127.0.0.1");
    new java.lang.Thread(control.Main.sensorConfigurator).start();
    control.Main.logReceiver.start();
}