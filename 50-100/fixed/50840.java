public double getYouthElevenSkill() {
    java.util.List<model.Player> firstEleven = getYouthFirstEleven();
    double sum = 0;
    for (model.Player player : firstEleven) {
        sum += player.getAverageSkill();
    }
    if ((firstEleven.size()) == 0) {
        return 0;
    }else {
        return sum / (firstEleven.size());
    }
}