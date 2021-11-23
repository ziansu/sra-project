@java.lang.Override
public boolean OnCommand(org.bukkit.entity.Player player, java.lang.String alias, java.lang.String[] args) {
    if (((args.length) > 0) && (org.apache.commons.lang3.StringUtils.isNumeric(args[0]))) {
        player.getInventory().addItem(buttondevteam.alipresents.components.insurance.Insurance.getInsurance(InsuranceType.Block, java.lang.Integer.parseInt(args[0])));
    }else {
        player.getInventory().addItem(buttondevteam.alipresents.components.insurance.Insurance.getInsurance(InsuranceType.Block));
    }
    return false;
}