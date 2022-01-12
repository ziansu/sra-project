@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof net.cloudhacking.androidgame2.engine.gl.TextRenderer.StringAndProps)) {
        return false;
    }else {
        net.cloudhacking.androidgame2.engine.gl.TextRenderer.StringAndProps other = ((net.cloudhacking.androidgame2.engine.gl.TextRenderer.StringAndProps) (o));
        return (s.equals(other.s)) && (props.equals(other.props));
    }
}