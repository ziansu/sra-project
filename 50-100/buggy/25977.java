@org.junit.Test
public void stressTestAlgo1() {
    java.lang.String text = "Foo bar hello world and so on nana nunu dada dudu asdf asdf akewf köjvnawer aisdfj awejfr iajdsöfj ewi adjsköfjwei ajsdökfj ief asd";
    com.google.common.base.Stopwatch stopwatch = com.google.common.base.Stopwatch.createStarted();
    for (int i = 0; i < 100000; i++) {
        com.optimaize.langdetect.ngram.OldNgramExtractor.extractNGrams(text, null);
    }
    java.lang.System.out.println(stopwatch);
}