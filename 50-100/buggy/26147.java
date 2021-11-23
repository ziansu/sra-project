@java.lang.Override
public void run() {
    java.util.Scanner text_reader = new java.util.Scanner(this.inputStream);
    while ((occurrenceCounter.isValid()) && (text_reader.hasNextLine())) {
        synchronized(stringBuffer) {
            java.lang.String a_line = text_reader.nextLine();
            if (filter.accept(a_line)) {
                stringBuffer.append(a_line).append('\n');
            }
            occurrenceCounter.increment();
        }
    } 
    text_reader.close();
}