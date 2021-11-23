@java.lang.Override
public com.alangpierce.lambdacalculusplayground.expressioncontroller.ExpressionController visit(com.alangpierce.lambdacalculusplayground.userexpression.UserFuncCall funcCall) {
    com.alangpierce.lambdacalculusplayground.expressioncontroller.ExpressionController funcController = createController(funcCall.func);
    com.alangpierce.lambdacalculusplayground.expressioncontroller.ExpressionController argController = createController(funcCall.arg);
    com.alangpierce.lambdacalculusplayground.view.FuncCallView view = com.alangpierce.lambdacalculusplayground.view.FuncCallView.render(dragObservableGenerator, viewRenderer, funcController.getView().getNativeView(), argController.getView().getNativeView());
    com.alangpierce.lambdacalculusplayground.expressioncontroller.FuncCallExpressionController result = new com.alangpierce.lambdacalculusplayground.expressioncontroller.FuncCallExpressionController(view, funcCall);
    funcController.setOnChangeCallback(result::handleFuncChange);
    argController.setOnChangeCallback(result::handleArgChange);
    return result;
}