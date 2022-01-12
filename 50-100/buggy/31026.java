@java.lang.Override
public java.lang.Exception enrichException(java.lang.Exception e) {
    if (e instanceof org.mule.modules.basic.CustomException) {
        return new org.mule.runtime.extension.api.exception.ModuleException(e, ((org.mule.modules.basic.CustomException) (e)).getType(), ("Ups: " + (e.getMessage())));
    }
    return e;
}