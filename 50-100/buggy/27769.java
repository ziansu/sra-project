@java.lang.Override
public void actionPerformed(pe.edu.uni.fiis.so.simulation.events.SimulationEvent event) {
    if ((nroLineas) > 10000) {
        jTextArea1.setText("");
    }
    java.lang.String line = event.getString("line");
    long t = event.getLong("timestamp");
    jTextArea1.append(((((pe.edu.uni.fiis.so.util.TimeParser.format(t)) + "> ") + line) + "\n"));
    (nroLineas)++;
}