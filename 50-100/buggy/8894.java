@org.junit.Test
public void doListRecurseTest() throws java.lang.Exception {
    java.util.Map m = new java.util.LinkedHashMap();
    java.util.List a = new java.util.ArrayList();
    m.put("b", "c");
    m.put("a", a);
    a.add("Hello");
    a.add(a);
    a.add(m);
    java.lang.String json = new ru.yandex.strictweb.ajaxtools.presentation.JsonRefPresentation().toString(a);
    java.lang.System.out.println(json);
}