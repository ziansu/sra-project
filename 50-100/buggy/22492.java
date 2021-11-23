static com.google.gson.JsonSerializer getSerializer(java.lang.Class clazz) {
    if (clazz.equals(ru.vat78.homeMoney.model.User.class))
        return new ru.vat78.homeMoney.controller.GsonSerializerBuilder.UserSerializer();
    
    if ((clazz.getSuperclass().equals(ru.vat78.homeMoney.model.dictionaries.Dictionary.class)) || (clazz.equals(ru.vat78.homeMoney.model.dictionaries.Dictionary.class)))
        return new ru.vat78.homeMoney.controller.GsonSerializerBuilder.DictionarySerializer();
    
    if ((clazz.equals(ru.vat78.homeMoney.model.dictionaries.TreeDictionary.class)) || (clazz.getSuperclass().equals(ru.vat78.homeMoney.model.dictionaries.TreeDictionary.class)))
        return new ru.vat78.homeMoney.controller.GsonSerializerBuilder.TreeSerializer();
    
    return null;
}