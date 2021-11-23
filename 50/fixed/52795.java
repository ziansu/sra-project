private void setAlias(java.lang.String[] arguments) {
    main.Constants.COMMAND_TYPE commandType = getAction(arguments[0]);
    java.lang.String alias = arguments[1];
    commandList_.setAlias(commandType, alias);
}