@java.lang.Override
public void save() {
    com.google.common.base.Preconditions.checkArgument(tagStack.isEmpty(), "Unfinished tags %s", tagStack);
    mapper.add("\n");
    mapper.finish();
}