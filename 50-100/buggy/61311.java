@java.lang.Override
public void run() {
    java.io.File sentenceFile;
    while ((sentenceFile = files.poll()) != null) {
        try (uk.ac.susx.tag.apt.tasks.ConllReader<java.lang.String[]> sentencesFromFile = uk.ac.susx.tag.apt.tasks.ConllReader.from(uk.ac.susx.tag.apt.tasks.IO.reader(sentenceFile))) {
            for (java.util.List<java.lang.String[]> sentence : sentencesFromFile) {
                sentences.add(sentence);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    } 
}