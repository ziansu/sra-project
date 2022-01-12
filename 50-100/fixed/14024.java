@java.lang.Override
public com.fasterxml.jackson.core.JsonToken nextToken() throws java.io.IOException {
    if (_rootReader) {
        com.fasterxml.jackson.core.JsonToken t = (_decoder.isEnd()) ? null : _wrappedReader.readValue(_parser, _decoder);
        return _currToken = t;
    }
    _parser.setAvroContext(getParent());
    return _currToken = _wrappedReader.readValue(_parser, _decoder);
}