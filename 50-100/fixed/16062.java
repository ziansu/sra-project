@java.lang.Override
public void run() {
    sample.ShopInfo info = new sample.ShopInfo();
    java.util.ArrayList<java.lang.String> images = new java.util.ArrayList<>();
    for (org.jsoup.nodes.Element e : new org.jsoup.nodes.Document(url).select("#review_list img")) {
        images.add(e.attr("data-original"));
    }
    info.setUrl(url);
    info.setImageData(images);
    shopInfoList.add(info);
    java.lang.System.out.println(((threadCount) + "번 째 스레드 작업 종료"));
}