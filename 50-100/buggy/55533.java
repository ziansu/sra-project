private void initLifts(final boolean isTrainingMaxes) {
    lifts = new java.util.ArrayList<>();
    lifts.add(new com.habna.dev.fivethreeone.Models.Lift(Lift.BODY_TYPE.CHEST, weekType, trainingMaxes.get(Lift.BODY_TYPE.CHEST)));
    lifts.add(new com.habna.dev.fivethreeone.Models.Lift(Lift.BODY_TYPE.BACK, weekType, trainingMaxes.get(Lift.BODY_TYPE.BACK)));
    lifts.add(new com.habna.dev.fivethreeone.Models.Lift(Lift.BODY_TYPE.SHOULDERS, weekType, trainingMaxes.get(Lift.BODY_TYPE.SHOULDERS)));
    lifts.add(new com.habna.dev.fivethreeone.Models.Lift(Lift.BODY_TYPE.LEGS, weekType, trainingMaxes.get(Lift.BODY_TYPE.LEGS)));
}