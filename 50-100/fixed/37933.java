protected void alarmLimitSample(org.mdpnp.devices.AbstractDevice.InstanceHolder<org.mdpnp.devices.AlarmLimit> holder, java.lang.String unit_id, java.lang.Float newValue) {
    if (0 != (java.lang.Float.compare(newValue, holder.data.value))) {
        holder.data.value = newValue;
        holder.data.unit_identifier = unit_id;
        alarmLimitDataWriter.write(holder.data, holder.handle);
    }
}