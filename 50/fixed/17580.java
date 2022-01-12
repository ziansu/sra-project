public org.dartlang.vm.service.element.CodeRef getCode() {
    return (json.get("code")) == null ? null : new org.dartlang.vm.service.element.CodeRef(((com.google.gson.JsonObject) (json.get("code"))));
}