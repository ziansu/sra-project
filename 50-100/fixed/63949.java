private void addComplementLetters(final java.util.Set<LETTER> lettersUsed, final java.util.List<de.uni_freiburg.informatik.ultimate.plugins.analysis.automatondeltadebugger.utils.TypedLetter<LETTER>> unused, final de.uni_freiburg.informatik.ultimate.plugins.analysis.automatondeltadebugger.utils.LetterType letterType, final java.lang.Iterable<LETTER> letters) {
    for (final LETTER letter : letters) {
        if (!(lettersUsed.contains(letter))) {
            unused.add(new de.uni_freiburg.informatik.ultimate.plugins.analysis.automatondeltadebugger.utils.TypedLetter(letter, letterType));
        }
    }
}