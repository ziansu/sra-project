@java.lang.Override
public java.lang.String[] createSchema(java.util.Map<java.lang.String, java.lang.Object> settings) {
    java.lang.String[] script = getConfig(settings).generateSchemaCreationScript(getDialectInternal());
    java.lang.String[] pre = getPreSchemaScript();
    java.lang.String[] post = getPostSchemaScript();
    script = (pre == null) ? post == null ? script : concat(script, post) : post == null ? concat(pre, script) : concat(pre, script, post);
    return checkCreateSchema(script);
}