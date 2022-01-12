@java.lang.Override
public java.lang.String encode(ouch.Readers.TextReadable text) {
    java.lang.String inputValue = text.getEntireString();
    this.value = ((T) (inputValue));
    this.valueToCalc = numToDec();
    return convert();
}