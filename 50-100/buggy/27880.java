@java.lang.Override
public net.darkhax.icse.lib.DataAccess overrideEntity(net.darkhax.icse.lib.DataAccess data) {
    net.darkhax.wawla.lib.InfoAccess info = new net.darkhax.wawla.lib.InfoAccess(data.world, data.player, data.entity, data.tag);
    if (info.isValidBlock())
        for (net.darkhax.wawla.plugins.InfoProvider provider : net.darkhax.wawla.Wawla.entityProviders)
            if (provider.requireEntityOverride(info))
                info = provider.overrideTile(info);
            
        
    
    return new net.darkhax.icse.lib.DataAccess(info.world, info.player, info.entity, info.tag);
}