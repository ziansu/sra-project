@java.lang.SuppressWarnings(value = "unchecked")
public boolean checkPermission(mytown.entities.Resident res, mytown.entities.flag.FlagType flagType, java.lang.Object denialValue) {
    if ((((getValue(flagType).equals(denialValue)) && (!(hasResident(res)))) && (!(residentHasFriendInTown(res)))) && ((!((java.lang.Boolean) (getValue(FlagType.RESTRICTIONS)))) || ((getMayor()) == res))) {
        return mytown.core.utils.PlayerUtils.isOp(res.getPlayer());
    }
    return true;
}