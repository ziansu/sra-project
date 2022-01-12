public jsFoundation.jsType.JsBoolean EqualTo(jsFoundation.jsType.JsVar name) throws java.lang.Exception {
    if (name instanceof jsFoundation.jsType.JsNumber)
        return new jsFoundation.jsType.JsBoolean(((((jsFoundation.jsType.JsNumber) (name)).Evaluate()) != 0));
    
    if (name instanceof jsFoundation.jsType.JsBoolean)
        return IdenticalTo(name);
    
    return name.EqualTo(this);
}