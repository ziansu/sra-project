@java.lang.Override
public java.lang.Runtime scrapeRuntime() {
    org.jsoup.nodes.Element lengthElement = document.select("div#video_length tr td.header + td span.text").first();
    java.lang.String lengthText = lengthElement.text();
    if ((lengthText.length()) > 0) {
        return new moviescraper.doctord.model.dataitem.Runtime(lengthText);
    }else
        return new moviescraper.doctord.model.dataitem.Runtime("");
    
}