@java.lang.Override
protected java.util.function.Predicate<pl.morecraft.dev.settler.web.dto.TransactionDTO> getSaveAuthorisationPredicate() {
    return ( obj) -> (java.util.Objects.isNull(obj.getId())) || (permissionManager.isAuthorized(obj.getId(), OperationType.EDT));
}