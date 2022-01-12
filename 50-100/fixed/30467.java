@java.lang.Override
public java.lang.String fail(int rating) {
    super.fail(rating);
    java.lang.String scrap = "";
    if ((skillMin) > (mekhq.campaign.personnel.SkillType.EXP_ELITE)) {
        scrap = " Armor supplies lost!";
        if (isSalvaging()) {
            remove(false);
        }else {
            skillMin = mekhq.campaign.personnel.SkillType.EXP_GREEN;
            changeAmountAvailable(((-1) * (java.lang.Math.min(amountNeeded, getAmountAvailable()))));
        }
    }
    return (" <font color='red'><b> failed." + scrap) + "</b></font>";
}