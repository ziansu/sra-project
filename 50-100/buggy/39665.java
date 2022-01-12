@java.lang.Override
public void serialize(org.auraframework.util.json.Json json) throws java.io.IOException {
    if (hasFunctions()) {
        json.writeMapBegin();
        serializeMethod(json, "render", render);
        serializeMethod(json, "afterRender", afterRender);
        serializeMethod(json, "rerender", rerender);
        serializeMethod(json, "unrender", unrender);
        json.writeMapEnd();
    }
}