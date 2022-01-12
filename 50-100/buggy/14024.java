@java.lang.Override
public com.fasterxml.jackson.core.JsonToken nextToken() throws java.io.IOException {
    if ((_rootReader) && (_decoder.isEnd())) {
        return _currToken = null;
    }
    _parser.setAvroContext(getParent());
    return _currToken = _wrappedReader.readValue(_parser, _decoder);
}