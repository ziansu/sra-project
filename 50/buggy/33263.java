public void spawn(Model.Star newStar) {
    stars.add(newStar);
    calcAura0(newStar);
    calcAura1(newStar);
    calcAura2(newStar);
}