@java.lang.Override
public void set(csc426.Value value) throws csc426.ValueError {
    this.value = new csc426.Value.IntValue(value.intValue());
}