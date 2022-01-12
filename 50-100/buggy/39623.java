@java.lang.Override
public boolean move(int desiredRank, int desiredFile) {
    int rankDistance = desiredRank - (_rank);
    int fileDistance = desiredRank - (_file);
    if ((((rankDistance < 2) && (rankDistance > (-2))) && (fileDistance < 2)) && (fileDistance > (-2))) {
        return super.move(desiredRank, desiredFile);
    }else {
        return castle(desiredRank, desiredFile);
    }
}