@java.lang.Override
public void add(java.lang.String property, ru.nojs.json.JSONElement value) {
    if (value == null) {
        value = MyJSONNull.INSTANCE;
    }
    members.put(property, value);
}