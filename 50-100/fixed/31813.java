public void jump() {
    if (((!(jumping)) || (!(dodging))) || (!(hit))) {
        body.applyLinearImpulse(getUserData().getJumpingLinierImpulse(), body.getWorldCenter(), true);
        jumping = true;
    }
}