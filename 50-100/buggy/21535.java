public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String sentence = "日本发型师比较贵，中国的就便宜点，我觉得他们剪得不错的，价格也还可以。尤其是我第一次从长发剪成短发，就很划算，剪得也好，同学同事都说成熟了。第二次替我剪了个太新潮的发型，我实在不能接受。";
    java.lang.String path1 = "/Users/qiangwang/Downloads/hair.csv";
    java.lang.String path2 = "/Users/qiangwang/Downloads/r.csv";
    int lineNum = 1000;
    com.dp.nlp.review.udf.ChineseParser parser = new com.dp.nlp.review.udf.ChineseParser();
    parser.processFile(path1, path2, lineNum);
}