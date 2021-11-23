@java.lang.Override
public boolean apply(net.indybracket.tourney.common.Bracket bracket) {
    return ((bracket.getPrincipalName()) != null) && (bracket.getPrincipalName().equals(principal));
}