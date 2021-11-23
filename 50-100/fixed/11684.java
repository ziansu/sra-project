public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new org.sbml.jsbml.text.parser.Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++)
        jj_la1[i] = -1;
    
    for (int i = 0; i < (jj_2_rtns.length); i++)
        jj_2_rtns[i] = new org.sbml.jsbml.text.parser.FormulaParserLL3.JJCalls();
    
}