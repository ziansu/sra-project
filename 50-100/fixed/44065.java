@org.junit.Test
public void TextFormatterTest() {
    java.lang.String filepath = "/home/yurii/Documents/konstytucja.txt";
    agh.cs.lab8.FileReaderAndOpener f1 = new agh.cs.lab8.FileReaderAndOpener();
    java.util.List<java.lang.String> lines1;
    lines1 = f1.openAndReadFile(filepath);
    agh.cs.lab8.TextFormatter tf1 = new agh.cs.lab8.TextFormatter(lines1);
    tf1.removeKancelaria();
    tf1.removeDate();
    tf1.removeSingleChar();
    tf1.removeHyphens();
    agh.cs.lab8.TextSplitter ts1 = new agh.cs.lab8.TextSplitter(tf1.getLines());
    agh.cs.lab8.Document doc1 = ts1.putTogether();
}