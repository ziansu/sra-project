@java.lang.Override
public void handle(java.lang.Exception e, java.lang.String message) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(com.app.util.ObjectUtil.getStackStraceAsString(e));
    builder.append((" with Message -> " + message));
    java.lang.System.out.println(builder.toString());
}