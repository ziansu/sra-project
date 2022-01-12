@java.lang.Override
public java.lang.Runtime scrapeRuntime() {
    org.jsoup.nodes.Element lengthElement = document.select("div#video_length tr td.header + td span.text").first();
    java.lang.String lengthText = lengthElement.text();
    if ((lengthText.length()) > 0) {
        return new java.lang.Runtime(lengthText);
    }else
        return new java.lang.Runtime("");
    
}