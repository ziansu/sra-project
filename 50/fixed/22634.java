private static boolean isLegalLocaleKeyLiteral(ru.eaze.locale.StringLiteralExpression element) {
    return ((element.getContext()) instanceof ru.eaze.locale.AssignmentExpression) && (ru.eaze.locale.EazeLocaleUtil.deepIsValidKey(element.getContents(), element.getProject()));
}