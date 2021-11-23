public void disabledInit() {
    main.Robot.gameState = main.Robot.GameState.Disabled;
    new main.commands.stirrer.Stir(Constants.stirrerMotorOff);
    main.Robot.mEnabledLooper.stop();
    main.Robot.mDisabledLooper.start();
}