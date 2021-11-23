@java.lang.Override
public void reportAmbiguity(org.antlr.v4.runtime.Parser parser, org.antlr.v4.runtime.dfa.DFA dfa, int i, int i1, boolean bln, java.util.BitSet bitset, org.antlr.v4.runtime.atn.ATNConfigSet atncs) {
    if (!(sp.isModificado())) {
        sp.println(((("Ambiguidade: linha " + i) + ":") + i1));
    }
}