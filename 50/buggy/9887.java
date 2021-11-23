@java.lang.Override
public com.github.luischavez.database.link.Affecting update(java.lang.String sql, com.github.luischavez.database.grammar.Bindings bindings, com.github.luischavez.database.link.Transform transform) {
    return this.execute(sql, bindings, transform);
}