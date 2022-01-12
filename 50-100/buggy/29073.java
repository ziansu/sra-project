public static void main(java.lang.String[] args) {
    edu.keith.mvc.es.BasicClient client = new edu.keith.mvc.es.BasicClient();
    client.doConnect();
    java.lang.String index = "comment_index";
    java.lang.String type = "comment_ugc";
    java.lang.String id = "comment_123674";
    java.lang.String result = client.getById("megacorp", "employee", "2");
    java.lang.System.out.println(result);
}