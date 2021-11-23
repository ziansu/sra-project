private void alphabetized() {
    PipeFilter.Information info = inPipe.read();
    java.util.ArrayList<java.lang.String> temp = info.getLines();
    java.util.Collections.sort(temp);
    outPipe.write(new PipeFilter.Information(temp, info.getIgnoreWords()));
}