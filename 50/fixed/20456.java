@java.lang.Override
public boolean apply(net.indybracket.tourney.common.Bracket bracket) {
    bracket.init();
    return ((bracket.getPrincipalName()) != null) && (bracket.getPrincipalName().equals(principal));
}