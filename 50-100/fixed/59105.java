public void read(boolean all, br.com.ceunes.ramses.read.Interface interfac2, br.com.ceunes.ramses.architecture.Circuit circuit) throws java.io.IOException {
    this.interfac2 = interfac2;
    this.circuit = circuit;
    unit = new br.com.ceunes.ramses.architecture.ControlUnit(interfac2, circuit);
    java.io.FileInputStream entrada = new java.io.FileInputStream("file.txt");
    java.io.InputStreamReader entradaFormatada = new java.io.InputStreamReader(entrada);
    entradaString = new java.io.BufferedReader(entradaFormatada);
    if (all)
        loop(true);
    else
        loop(false);
    
}