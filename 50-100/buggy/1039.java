@java.lang.Override
public void setup(api.Robotarm robotarm) {
    MyStateListener._l_state.add(new at.pria.osiris.osiris.controllers.hedgehog.MyStateListener());
    dl = new at.pria.osiris.osiris.communication.DataListener();
    at.pria.osiris.osiris.sensors.SensorRefreshable sensorRefreshable = at.pria.osiris.osiris.view.TableSensorValuesFragment.getInstance(1, robotarm);
    dl.addMessageProcessor(new at.pria.osiris.osiris.communication.messageProcessor.StringProcessor(robotarm, sensorRefreshable));
    dl.addMessageProcessor(new at.pria.osiris.osiris.communication.messageProcessor.SensorValueResponseProcessor(robotarm, sensorRefreshable));
    ExecutionListener._l_exec.add(dl);
}