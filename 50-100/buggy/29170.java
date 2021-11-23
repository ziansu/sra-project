@org.junit.Test
public void shouldInstrumentLabelWithBraces() {
    java.lang.String source = "outloop:\n" + (((("  {\n" + "    for (var j = 0; j < 10; j++) {\n") + "        break outloop;\n") + "    }") + "  }");
    java.lang.String instrumentedSource = sourceProcessor.instrumentSource(source);
    java.lang.String expectedSource = "_$jscoverage[\'test.js\'].lineData[1]++;\n" + ((((((("outloop:\n" + "  {\n") + "    _$jscoverage[\'test.js\'].lineData[3]++;\n") + "    for (var j = 0; j < 10; j++) {\n") + "      _$jscoverage[\'test.js\'].lineData[4]++;\n") + "      break outloop;\n") + "    }\n") + "  }\n");
    org.junit.Assert.assertEquals(expectedSource, instrumentedSource);
}