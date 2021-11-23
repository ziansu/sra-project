@java.lang.Override
public void addPlayerTime(chess.domain.Time timeToAdd) {
    chess.domain.Time whoseTime = ((whoseMove) == (chess.domain.Colors.WHITE)) ? whiteTime : blackTime;
    whoseTime.add(timeToAdd);
}