@org.junit.Test
public void stressTestAlgo2() {
    com.optimaize.langdetect.ngram.NgramExtractor ngramExtractor = com.optimaize.langdetect.ngram.NgramExtractor.gramLengths(1, 2, 3);
    java.lang.String text = "Foo bar hello world and so on nana nunu dada dudu asdf asdf akewf köjvnawer aisdfj awejfr iajdsöfj ewi adjsköfjwei ajsdökfj ief asd";
    com.google.common.base.Stopwatch stopwatch = new com.google.common.base.Stopwatch();
    stopwatch.start();
    for (int i = 0; i < 100000; i++) {
        ngramExtractor.extractGrams(text);
    }
    java.lang.System.out.println(stopwatch);
}