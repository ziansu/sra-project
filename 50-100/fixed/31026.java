@java.lang.Override
public java.lang.Exception enrichException(java.lang.Exception e) {
    if (e instanceof org.mule.modules.basic.CustomException) {
        return new org.mule.runtime.extension.api.exception.ModuleException(("Ups: " + (e.getMessage())), ((org.mule.modules.basic.CustomException) (e)).getType(), e);
    }
    return e;
}