public java.util.ArrayList<logic.Creature> getBoss() {
    java.util.ArrayList<logic.Creature> list = new java.util.ArrayList<logic.Creature>();
    for (logic.Creature c : creatures) {
        if (c instanceof logic.BossDTO) {
            list.add(c);
        }
    }
    return null;
}