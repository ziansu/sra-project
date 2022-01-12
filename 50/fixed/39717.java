@java.lang.Override
public com.jcabi.github.User map(final javax.json.JsonObject object) {
    return this.get(object.getString("id"));
}