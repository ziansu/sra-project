@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> toMap() {
    java.util.Map<java.lang.String, java.lang.Object> map = super.toMap();
    map.put("price", getPrice());
    map.put("type", getType());
    map.put("name", getName());
    map.put("vintage", getVintage());
    map.put("picture", getPicture());
    return map;
}