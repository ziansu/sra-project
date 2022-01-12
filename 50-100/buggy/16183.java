@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof com.example.android.common.Markov.Prefix)) {
        return false;
    }
    com.example.android.common.Markov.Prefix p = ((com.example.android.common.Markov.Prefix) (o));
    return (p.pref[0].equals(pref[0])) && (p.pref[1].equals(pref[1]));
}